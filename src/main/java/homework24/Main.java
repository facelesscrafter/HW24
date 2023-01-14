package homework24;

public class Main {
    public static void main(String[] args) {
        int n=4;
    /*    System.out.println("Доступные специальности");
        for (StudyProfile p : StudyProfile.values()) {System.out.println(p + ", " + p.profileName);
        }

     */
        University[] universities=new University[5];
        Student[] students=new Student[5];

        universities[0]=new University("1",
                "Национальный исслеедовательский ядерный университет ",
                "НИЯУ МИФИ",
                1942,
                StudyProfile.PHYSICS);
        universities[1]=new University("2",
                "Сеченовский Университет",
                "ФГАОУ ВО Первый МГМУ им. И.М. Сеченова ",
                1758,
                StudyProfile.MEDICINE);
        universities[2]=new University("3",
                "Национальный исследовательский университет \"Высшая школа экономики\"",
                "НИУ ВШЭ",
                1992,
                StudyProfile.ONEMOREMACKDONALDSTAFF);
        universities[3]=new University("4",
                "Национальный исследовательский Томский политехнический университет",
                "НИИ ТПУ",
                1896,
                StudyProfile.AWESOMEGUYS);
        universities[4]=new University("5",
                "Московский государственный университет",
                "МГУ",
                1755,
                StudyProfile.MACKDONALDSTAFF);

        students[0]=new Student("Стивен Хокинг",
                "1",
                2,
                5);
        students[1]=new Student("Грегори Хаус",
                "2",
                4,
                5);
        students[2]=new Student("Остап Бендер",
                "3",
                3,
                4);
        students[3]=new Student("Бьерн Страуструп",
                "4",
                5,
                5);
        students[4]=new Student("Гуманитарий Гуманитариев",
                "5",
                6,
                3);


        System.out.println(universities[n]);
        System.out.println(students[n]);
    }

}
