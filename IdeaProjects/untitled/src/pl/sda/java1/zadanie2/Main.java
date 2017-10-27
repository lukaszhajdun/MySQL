package pl.sda.java1.zadanie2;

import java.util.logging.Logger;

/**
 * Created by RENT on 2017-06-28.
 */
public class Main {

    static Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        Exams exams = new Exams();
        //log.info(exams.toString());

        exams.setMath(3.0F);
        exams.setPhysics(2.0F);
        exams.setPolish(3.5F);

        //log.info(exams.toString());


        Exams exams2;
        exams2 = new Exams(4, 3.5F, 3.5F);

        //log.info(exams2.toString());

        //log.info(String.format("Srednia: %.2f", exams2.avg()));
        ///log.info(exams2.avg());

        //log.info("Passed exams: " + exams.passed());
        //log.info("Passed exams2: " + exams2.passed());

        // W domu zrobić gettery


        int numberOfExams = 4;
        Exams[] list = new Exams[numberOfExams];

        list[0] = new Exams(3, 4, 5);
        list[1] = new Exams(5, 2, 3.5F);
        list[2] = new Exams(2, 2, 3);
        list[3] = new Exams(3.5F, 3, 4.5F);

        log.info("Passed: ");
        for (Exams ex : list) {
            if (ex.passed()) {
                log.info(ex.toString());
            }
        }
        log.info("Failed: ");
        for (int i = 0; i < list.length; i++) {
            if (!list[i].passed()) {
                log.info(list[i].toString());
                list[i].retestAll();

                if (list[i].passed()) {
                    log.info("Retest passed!");
                }
            }
        }


    }


}
