DROP DATABASE IF EXISTS Bookstore;

CREATE DATABASE Bookstore;
USE Bookstore;

CREATE TABLE Books
(
`IdBook` INT NOT NULL AUTO_INCREMENT,
`AuthorName` TEXT 
CHARACTER SET utf8 COLLATE utf8_polish_ci NOT NULL,
`AuthorSurName` TEXT 
CHARACTER SET utf8 COLLATE utf8_polish_ci NOT NULL,
`Title`  TEXT 
CHARACTER SET utf8 COLLATE utf8_polish_ci NOT NULL,
`Price` FLOAT,
PRIMARY KEY(`IdBook`)
)
DEFAULT CHARSET=utf8 COLLATE=utf8_polish_ci 
AUTO_INCREMENT=1;


CREATE TABLE Orders
(
`IdOrder` INT NOT NULL AUTO_INCREMENT,
`IdCustomer` INT NOT NULL,
`IdBook` INT,
`OrderDate` DATE,
`Status` VARCHAR(20)
CHARACTER SET utf8 COLLATE utf8_polish_ci,
PRIMARY KEY(`IdOrder`)
)
DEFAULT CHARSET=utf8 COLLATE=utf8_polish_ci 
AUTO_INCREMENT=1;


CREATE TABLE Customers
(
`IdCustomer` INT NOT NULL AUTO_INCREMENT,
`customerName` TEXT 
CHARACTER SET utf8 COLLATE utf8_polish_ci NOT NULL,
`customerSurname` TEXT 
CHARACTER SET utf8 COLLATE utf8_polish_ci NOT NULL,
`City` TEXT 
CHARACTER SET utf8 COLLATE utf8_polish_ci,
PRIMARY KEY(`IdCustomer`)
)
DEFAULT CHARSET=utf8 COLLATE=utf8_polish_ci 
AUTO_INCREMENT=1;


#Insert

INSERT INTO Books (`AuthorName`, `AuthorSurname`, `Title`, `Price`)
VALUES
("Jan", "Michalak", "Zaawansowane programowanie w PHP", 47.29),
("Andrzej", "Krawczyk", "Zaawansowana administracja systemem", 49.99),
("Paweł", "Jakubowski", "HTML5. Tworzenie witryn", 53.65),
("Tomasz", "Kowalski", "Urządzenia technik komputerowej", 34.15),
("Łukasz", "Pasternak", "Java. Tworzenie nowoczesnych stron WWW", 29.99);

INSERT INTO Customers (`customerName`,`customerSurname`,`City`)
VALUES
("Łukasz","Lewandowski", "Poznań" ),
("Jan", "Nowak", "Katowice"),
("Maciej", "Wójcik", "Bydgoszcz"),
("Agnieszka", "Jankowska", "Lublin"),
("Tomasz", "Mazur", "Jelenia Góra"),
("Michał", "Zieliński", "Kraków"),
("Artur", "Rutkowski", "Kielce"),
("Mateusz","Skorupa", "Gdańsk"),
("Jerzy", "Rutkowski", "Włóżmitu"),
("Anna", "Karenna", "Tumidaj");

INSERT INTO Orders (`IdCustomer`,`IdBook`,`OrderDate`, `Status`)
VALUES
(2, 4, "2017-10-08", "Oczekiwanie"),
(7, 1, "2017-09-05", "Wyslano"),
(9, 1, "2017-10-11", "Wyslano"),
(2, 2, "2017-10-15", "Oczekiwanie"),
(2, 5, "2017-08-12", "Oczekiwanie"),
(3, 2, "2017-10-20", "Wyslano"),
(4, 3, "2017-08-14", "Wyslano"),
(8, 1, "2017-08-19", "Wyslano"),
(3, 1, "2017-11-19", "Wyslano"),
(9, 2, "2017-12-28", "Oczekiwane");


#Jednazklientekksięgarni–AgnieszkaJankowska(id=4)wyszłazamąż.
#OddzisiajbędziesięnazywaćPsikuta.
#CieszymysięwrazzniąjejnowymnazwiskiemichcemyumożliwićAgnieszcezmianęjejprofiluipodzieleniesięswoimradosnymnazwiskiem.

USE Bookstore;
UPDATE Customers SET customerSurname = "Psikuta" WHERE IdCustomer = 4;

#sprawdzenie
SELECT*FROM Customers WHERE IdCustomer = 4;

/*
SELECT*FROM Books;
SELECT*FROM Orders;
SELECT*FROM Customers;



SELECT * FROM Books ORDER BY Title ASC;



SELECT c.customerName, c.customerSurname, o.IdOrder, o.orderDate 
FROM Orders AS o, Customers AS c
WHERE o.IdCustomer = c.IdCustomer;


#2.Wyjmijimię,nazwiskoklientów,którzykiedykolwiekzamówiliksiążkęnr2.Spróbujskorzystaćzaliasów.

SELECT c.customerName, c.CustomerSurname 
FROM Customers AS c, Orders AS o
WHERE o.IdBook = 2 AND c.IdCustomer = o.IdCustomer;


#3.Jakieksiążki(tytułiautor)zamówiłJanNowak?

SELECT b.AuthorName, b.AuthorSurname, b.Title 
FROM
Books AS b, Orders AS o, Customers AS c
WHERE
c.CustomerName = "Jan" AND
c.CustomerSurname = "Nowak" AND
c.IdCustomer = o.IdCustomer AND
o.IdBook = b.IdBook;

#4.PosortujzamówieniadokonaneprzezosobyonazwiskuRutkowskiułożonewgdatyodnajpóźniejdokonanych.
#Chcemywyświetlić:imięinazwiskoosobyzamawiającej,idzamówienia,datę,statuszamówienia,tytułzamówionejksiążki.

SELECT c.CustomerName, c.CustomerSurname, o.IdOrder, o.OrderDate, o.Status, b.Title 
FROM
Customers AS c, Orders AS o, Books AS b
WHERE
c.CustomerSurname = "Rutkowski" AND
c.IdCustomer = o.IdCustomer AND
o.IdBook = b.IdBook
ORDER BY
o.OrderDate ASC;
*/




