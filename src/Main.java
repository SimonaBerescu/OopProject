public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        /*am creat cu "new" un obiect de tipul Book, si acum putem sa apelam fie atributele (campurile-variabile) din
        clasa Book, fie metodele din clasa respectiva
         */

        book1.showAuthorAndTitle();
        System.out.println(book1.showAuthorAndTitle());

        //creaza obiect nou din clasa Oop
        Oop object1 = new Oop();
        Oop object2 = new Oop();
        System.out.println(object1.x);
        object2.x = 10; // suprascrierea lui x
        System.out.println(object2.x);
        Oop object3 = new Oop();
        object3.y = 40; // atribui valure lui y, care e nedefinit in clasa Oop
        System.out.println(object3.y);

        Cars BMW = new Cars();
        Cars Volvo = new Cars();
        System.out.println(BMW.culoare + " " + BMW.anFabricatie);
        Volvo.culoare = "Albastru";
        Volvo.anFabricatie = 2020;
        System.out.println(Volvo.culoare + " " + Volvo.anFabricatie);

        Persoana person1 = new Persoana();
        System.out.println("Nume:" + person1.nume + " Prenume:" + person1.prenume);
        System.out.println("Varsta:" + person1.varsta);

        Persoana person2 = new Persoana("Berescu", "Simona");
        System.out.println("Nume:" + person2.nume + " Prenume:" + person2.prenume);
        System.out.println("Varsta:" + person2.varsta);
        System.out.println("Gen:" + person2.gen);

        Persoana person3 = new Persoana("Berescu", "Simona", 30, "f");
        System.out.println("Nume:" + person3.nume + " Prenume:" + person3.prenume);
        System.out.println("Varsta:" + person3.varsta);
        System.out.println("Gen:" + person3.gen);

        //exercitii clasa Animal
        System.out.println("*******************************");
        System.out.println("*****Exercitii***********");

        Animal animal1 = new Animal();
        System.out.println("Animal:" + animal1.nume);
        System.out.println("Culoare:" + animal1.culoare);
        System.out.println("Vegetarian:" + animal1.vegetrian);
        System.out.println("Numar de picioare:"+animal1.nrPicioare);

        Animal animal2 = new Animal("leu", "maro", false);
        System.out.println("Animal:" + animal2.nume);
        System.out.println("Culoare:" + animal2.culoare);
        System.out.println("Vegetarian:" + animal2.vegetrian);

        Animal animal3 = new Animal("oaie", true);
        System.out.println("Animal:" + animal3.nume + " Vegetarian:" + animal3.vegetrian);

        Animal animal4 = new Animal();
        animal4.doarme("hipopotamul");
        animal4.mananca("gaina");
        System.out.println(animal4.afiseaza("urs polar","alba"));

        animal2.mananca("leul");
        animal3.doarme("oaia");

        Animal animal5 = new Animal("Sarpe", "verde", false, 0);
        System.out.println("Animal:"+animal5.nume+"  Culoare:"+animal5.culoare+"  Vegetarian:"+animal5.vegetrian+"  Numar de picioare:"+animal5.nrPicioare);

        Animal animal6 = new Animal("caine", "alb", true, 4);
        animal6.setUndeTraieste("pe uscat");
        System.out.println("Animal:"+animal6.nume);
        animal6.afiseazaNrPicioare();
        System.out.println("Unde traieste:"+animal6.getUndeTraieste());


        Animal animal7 = new Animal("papagal",2);
        animal7.setUndeTraieste("in aer");
        System.out.println("Animal:"+animal7.nume);
        animal7.afiseazaNrPicioare();
        System.out.println("Unde traieste:"+animal7.getUndeTraieste());


        Animal animal8 = new Animal("caracatita", 8);
        animal8.setUndeTraieste("in apa");
        System.out.println("Animal:"+animal8.nume);
        animal8.afiseazaNrPicioare();
        System.out.println("Unde traieste:"+animal8.getUndeTraieste());



        System.out.println("*******************************");
        System.out.println("Laborator 26");
        //Laborator 26

        Film film1 = new Film();
        film1.setTitlu("Avatar 2");
        film1.getTitlu();
        film1.rating = 7.9;
        film1.potrivitPtCopii = false;

        film1.afiseazaDacaEPotrivitPtCopii();
        System.out.println(film1.anAparitie);

        Film film2 = new Film("Motanul incaltat 2",2021,true);
        System.out.println(film2.rating);
        film2.afiseazaDacaEPotrivitPtCopii();
        film2.rating = 8;
        System.out.println(film2.afisezaRating());
        System.out.println(film1.afisezaRating());

        /*Static - apartine clasei, nu obiectelor individuale - daca suprascriem se schimba la toate obiectele
            Se apeleaza cu className.numeMetoda
            daca era creat in aceiasi clasa in care voiam afisarea, puteam apela direct metoda.
         */
       System.out.println(Film.afiseazaUnText());


        Elev elev1 = new Elev("Pop Andrei");
        Elev elev2 = new Elev("Ionescu Maria");
        Elev elev3 = new Elev("Popescu Vlad");
        elev1.diriginte = "Diriginte1";
        elev2.diriginte = "Diriginte2";
        elev3.diriginte = "Diriginte3";

        elev1.afisezaElevDiriginte();
        elev2.afisezaElevDiriginte();
        elev3.afisezaElevDiriginte();

        Inotator inotator1 = new Inotator();
        Maratonist maratonist1 = new Maratonist();
        inotator1.seAntreneaza();
        maratonist1.seAntreneaza();
        inotator1.seOdihneste();
        maratonist1.seOdihneste();

        Tableta tableta1 = new Tableta();
        Smartphone smartphone1 = new Smartphone();
        SmartPhoneIOS smartPhoneIOS1 = new SmartPhoneIOS();
        SmartphoneAndroid smartphoneAndroid1 = new SmartphoneAndroid();


        tableta1.porneste();
        smartphone1.seOpreste();
        smartphoneAndroid1.porneste();
        smartphoneAndroid1.seOpreste();
        smartPhoneIOS1.porneste();
        smartphoneAndroid1.seOpreste();


    }



}
