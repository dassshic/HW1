public class Main {
    public static void main(String[] args) {
        // #1
        var dog = 8.0;
        System.out.println("dog = " + dog);
        var cat = 3.6;
        System.out.println("cat = " + cat);
        var paper = 763789;
        System.out.println("paper = " + paper);
// #2
        dog = dog + 4;
        System.out.println("dog1 = " + dog);
        cat = cat + 4;
        System.out.println("cat1 = " + cat);
        paper = paper + 4;
        System.out.println("paper1 = " + paper);
// #3
        dog = dog - 3.5;
        System.out.println("dog2 = " + dog);
        cat = cat - 1.6;
        System.out.println("cat2 = " + cat);
        paper = paper - 7639;
        System.out.println("paper2 = " + paper);

// #4
        var friend = 19;
        System.out.println ("friend = " + friend);
        friend = friend + 2;
        System.out.println ("friend1 = " + friend);
        friend = friend / 7;
        System.out.println ("friend2 = " + friend);

// #5
        var frog = 3.5;
        System.out.println ("frog = " + frog);
        frog = frog * 10;
        System.out.println ("frog1 = " + frog);
        frog = frog / 3.5;
        System.out.println ("frog2 = " + frog);
        frog = frog + 4;
        System.out.println ("frog3 = " + frog);

// #6
        var weightOfFirstBoxer = 78.2;
        var weightOfSecondBoxer = 82.7;
        var generalWeight = weightOfFirstBoxer + weightOfSecondBoxer;
        System.out.println ("Общий вес = " + generalWeight);
        var weightDifference = weightOfSecondBoxer - weightOfFirstBoxer;
        System.out.println ("Разница в весе = " + weightDifference);

// #7

        var weightDifference1 = weightOfSecondBoxer - weightOfFirstBoxer;
        System.out.println ("Разница в весе1 = " + weightDifference1);

        var weightDifference2 = weightOfSecondBoxer % weightOfFirstBoxer;
        System.out.println ("Разница в весе2 = " + weightDifference2);

// #8
        var timeOfWork = 640;
        var worktimeOfOnePerson = 8;
        var staff = timeOfWork / worktimeOfOnePerson;
        System.out.println ("Всего работников в компании "  + staff +  " человек");
        staff = staff + 94;
        timeOfWork = worktimeOfOnePerson * staff;
        System.out.println("Если в компании работает " + staff + " человек, то всего " + timeOfWork + " часов работы может быть поделено между сотрудниками");
    }
}