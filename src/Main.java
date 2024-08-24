public class Main {
    public static void main(String[] args) {
        // задача 1
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        // задача 2
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        // задача 3
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);
        // задача 4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
// задача 5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        // задачи 6 - 8
        var firstMass = 78.2;
        System.out.println(firstMass);
        var secondMass = 82.7;
        System.out.println(secondMass);
        var totalMass = firstMass + secondMass;
        System.out.println("Общий вес спорстменов " + totalMass);
        var remainder = firstMass - secondMass;
        System.out.println("Разница веса между бойцами " + remainder);
        var remain = secondMass % firstMass;
        System.out.println("Остаток деления между весами " + remain);
        var x = 640;
        var y = 8;
        var q = x / y;
        System.out.println("Всего работников в компании " + q + " человек");
        var z = x / y + 94;
        var o = x / (x / y + 94);
        System.out.println("Если в компании работает " + (x / y + 94) + " человек, то всего " + x / (x / y + 94) + " часа работы может быть поделено между сотрудниками");

    }
}

