USE Hospital;

#1
SELECT*FROM nurse WHERE Registered = 0;  #lub 'false' lub false 

#2
SELECT*FROM nurse WHERE Position LIKE '%Head%';

#KUBA
SELECT*FROM nurse WHERE Position = "Head Nurse";

#3
SELECT*FROM Physician WHERE Position LIKE '%Head%';

#KUBA
SELECT d.Name AS 'Department name', p.Name AS 'Physician name' 
FROM department d, Physician p 
WHERE d.head = p.employeeid;

SELECT*FROM department;
#4
SELECT COUNT(DISTINCT Patient) FROM Patient p, Appointment a
WHERE p.SSN = a.Patient;

#KUBA
SELECT COUNT(DISTINCT Patient) AS 'No. Patients'FROM Patient p, Appointment a
WHERE p.SSN = a.Patient;

#5
SELECT r.BlockFloor, r.BlockCode FROM Room r
WHERE r.RoomNumber = 212;

#KUBA
SELECT BlockFloor AS 'Floor', BlockCode AS 'BuildID' FROM Room
WHERE RoomNumber = 212;

#6
SELECT COUNT(r.RoomNumber) AS 'Free rooms' FROM room r WHERE r.Unavailable = 0;


#7
SELECT COUNT(r.RoomNumber) AS 'Unvailable rooms' FROM room r WHERE r.Unavailable = 1;

#8
SELECT p.Name, p.Position, d.Name  FROM physician p
JOIN affiliated_with a ON p.EmployeeID = a.Physician
JOIN department d ON d.DepartmentID = a.Department;

#KUBA
SELECT p.name AS 'Physician', d.name AS 'Department' 
FROM physician p, department d, affiliated_with a
WHERE p.EmployeeID = a.Physician AND d.DepartmentID = a.Department;

SELECT p.Name AS 'Physician', d.Name AS 'Deprartment'  FROM physician p
JOIN affiliated_with a ON p.EmployeeID = a.Physician
JOIN department d ON d.DepartmentID = a.Department;


#9
SELECT p.name AS 'Physician', c.name AS 'Treatment'
FROM Physician p, Procedures c, trained_in t
WHERE  t.physician = p.employeeID AND t.treatment = c.code;

SELECT p.name AS 'Physician', c.name AS 'Treatment'
FROM trained_in t
JOIN Physician p ON t.physician = p.employeeID 
JOIN Procedures c ON t.treatment = c.code;

#10
SELECT p.name AS 'Physician', p.position, d.name AS 'Department'
FROM Physician p JOIN affiliated_with a ON a.physician = p.employeeID
JOIN department d ON a.department = d.departmentID
WHERE primaryaffiliation = 0;

#11
SELECT p.name, p.position
FROM Physician p LEFT JOIN trained_in t ON t.physician = p.employeeID
WHERE t.treatment IS NULL Order by p.name;

#KUBA
SELECT p.name AS 'Physician', p.position AS 'Designation'
FROM Physician p LEFT JOIN trained_in t ON t.physician = p.employeeID
WHERE t.treatment IS null Order by employeeID;

#12
SELECT COUNT(DISTINCT patient) AS 'Patient No.' 
FROM Appointment WHERE examinationroom = 'C';

#13
SELECT n.name AS 'Nurse name', a.examinationroom AS 'Room No.'
FROM nurse n
JOIN Appointment a ON a.prepnurse = n.employeeID ORDER BY n.name;

#14
SELECT 	t.name AS 'Patient name', n.name AS 'Nurse', p.name AS 'Physician',
a.examinationroom AS 'Room No.', a.start
FROM Patient t
JOIN appointment a ON a.patient = t.ssn
JOIN nurse n ON a.prepnurse = n.employeeID
JOIN physician p ON a.physician = p.employeeID
WHERE a.start = "2008-04-25 10:00:00" ORDER BY p.name;

#15
SELECT t.name AS 'Patient', p.name AS 'Physician' FROM patient t
JOIN prescribes s ON s.patient = t.ssn
JOIN physician p ON s.physician = p.employeeID
JOIN medication m ON s.medication = m.code
WHERE s.appointment IS NULL;

#16
SELECT blockcode AS 'Block', COUNT(*) AS 'No Rooms'
FROM room
WHERE unavailable = 0 GROUP BY blockcode ORDER BY blockcode;

#17
SELECT blockfloor AS 'Floor', COUNT(*) AS 'No Rooms'
FROM room
WHERE unavailable = 0  GROUP BY blockfloor ORDER BY blockfloor;

#18
SELECT blockcode AS 'Block', blockfloor AS 'Floor', COUNT(*) AS 'No Rooms'
FROM Room 
WHERE unavailable = 0 GROUP BY blockcode, blockfloor  ORDER BY blockcode, blockfloor;

#19
SELECT blockcode AS 'Block', blockfloor AS 'Floor', COUNT(*) AS 'No Rooms'
FROM Room 
WHERE unavailable = 1 GROUP BY blockcode, blockfloor  ORDER BY blockcode, blockfloor;

#20 tak nie powinno sie robic bo nie jest to optymalne bo podwojna robota
SELECT blockfloor AS 'Floor', count(*) AS 'Rooms No.'
FROM room
WHERE unavailable = 0 GROUP BY blockfloor HAVING
COUNT(*) = 
(SELECT max(zz) AS 'Highest' FROM
(
SELECT blockfloor AS yy, count(*) AS zz FROM room r WHERE unavailable = 0 GROUP BY blockfloor
) AS zzz);

#WERSJA OPTYMALNA
SELECT max(zz), yy AS 'Highest' FROM 
(
SELECT blockfloor AS yy, count(*) AS zz FROM room r WHERE unavailable = 0 GROUP BY blockfloor
) AS zzz;

#KOLEJNA OPCJA
SELECT blockfloor AS 'Block', COUNT(*) AS 'No Rooms'
FROM Room 
WHERE unavailable = 0 GROUP BY blockfloor  ORDER BY  blockfloor LIMIT 1;