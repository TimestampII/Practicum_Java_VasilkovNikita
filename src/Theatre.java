import java.util.Scanner;

public class Theatre {
    public static void main(String[] args) {
        //Создание актёров, режиссёров, автора музыки и хореографа
        Actor actor1 = new Actor("Петерис", "Гаудиньш", Gender.MALE, 182);
        Actor actor2 = new Actor("Майя", "Эглите", Gender.FEMALE, 182);
        Actor actor3 = new Actor("Ивар", "Калныньш", Gender.MALE, 192);

        Director director1 = new Director("Петр", "Иванов", Gender.MALE, 175, 15);
        Director director2 = new Director("Елена", "Кузнецова", Gender.FEMALE, 168, 10);

        String musicAuthor = "Пётр Чайковский";
        String choreographer = "Мариус Петипа";
        //Создание одного обычного шоу, оперы и балета.
        Show regularShow = new Show("Гамлет",
                180,
                director1
        );

        Opera opera = new Opera(
                "Евгений Онегин",
                200,
                director2,
                musicAuthor,
                "История о любви Татьяны и Онегина...",
                30
        );

        Ballet ballet = new Ballet(
                "Лебединое озеро",
                150,
                director1,
                musicAuthor,
                "История о принце и заколдованной принцессе...",
                choreographer
        );

        //Распределение актёров по спектаклям
        regularShow.addActor(actor1);
        regularShow.addActor(actor2);

        opera.addActor(actor2);
        opera.addActor(actor3);

        ballet.addActor(actor1);
        ballet.addActor(actor3);

        // Вывод списка актёров для каждого спектакля
        System.out.println("\nСПИСОК АКТЁРОВ");
        regularShow.printAllActors();
        System.out.println();
        opera.printAllActors();
        System.out.println();
        ballet.printAllActors();

        // Замена актёра и вывод списка
        System.out.println("\nЗАМЕНА АКТЁРА");
        regularShow.replaceActor(actor3, "Эглите");
        regularShow.printAllActors();

        //Замена несуществующего актёра
        System.out.println("\nПОПЫТКА ЗАМЕНЫ НЕСУЩЕСТВУЮЩЕГО АКТЁРА");
        opera.replaceActor(actor1, "Несуществующий");

        //Вывод либретто
        System.out.println("\nЛИБРЕТТО");
        opera.printLibretto();
        System.out.println();
        ballet.printLibretto();
    }
}


