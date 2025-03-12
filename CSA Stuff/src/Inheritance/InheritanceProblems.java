//package Inheritance;
//
//public class InheritanceProblems {
//    // For all INHERITANCE PROBLEMS, refer to the classes, Pokemon, Poliwag, Poliwhirl, Politoad, and Poliwrath.
//    // problem 1. Determine the output of the program.
//
//    public void p1 () {
//        Pokemon p = new Poliwag();
//        Poliwag otherMon = (Poliwag)p;
//        otherMon.changeStrength(70);
//        System.out.println(p.winsFight(otherMon));
//        p.useMove();
//    }
//    // A.
//    // False
//    // Poliwag doesn't have a move!
//    // B.
//    // True
//    // Poliwag doesn't have a move!
//    // C.
//    // True
//    // Poliwag used water gun!
//    // D.
//    // False
//    // Poliwag used Tackle!
//    // E. The program will not run.
//
//    // problem 2. An Object a is said to be an EVOLUTION from an Object b if it inherits the properties from b.
//    // example: Lets say that raichu extends pikachu, then raichu would be an evolution from pikachu.
//    // Which of the following statements are true?
//    // A. Politoad is an evolution from Poliwrath.
//    // B. Politoad is an evolution from both Poliwag and Poliwhirl.
//    // C. Assume that Pokemon b is an Evolution of Pokemon a.
//    // The following code will compile without error:
//    // b = a;
//    // D. Since all Poliwag are evolutions from Pokemon, if a new object type is an evolution from Poliwag, then
//    // it is also an evolution from Pokemon.
//    // E. Pokemon is not an evolution from anything. Think carefully on this one!
//
//    // problem 3 and problem 4 refer to this function below.
//    // problem 3:
//    // There is also one error in the program, find which line it is in.
//    // Line 1 is the declaration of the function.
//    public void p3andp4() {
//        Poliwrath poliwrath = new Poliwrath(20);
//        Poliwag poliwag = new Poliwrath(10);
//        Pokemon pokemon = new Politoad();
//        poliwrath.useMove();
//        poliwag.useMove();
//        pokemon.useMove();
//        pokemon.useDrizzle();
//    }
//    // Write down which line it is in. Line 1 = public void p3andp4 () {
//    // problem 4:
//    // After fixing the error, determine the output of the program.
//
//    // A
//    // Poliwrath used body slam!
//    // Poliwrath used dynamic punch!
//    // Poliwrath used dynamic punch!
//    // Politoad used weather ball!
//    // B
//    // Poliwrath used dynamic punch!
//    // Poliwrath used body slam!
//    // Poliwrath used dynamic punch!
//    // Politoad used weather ball!
//    // C
//    // Poliwrath used body slam!
//    // Poliwrath used dynamic punch!
//    // Poliwrath used body slam!
//    // Poliwrath used dynamic punch!
//    // Politoad used weather ball!
//    // D
//    // Poliwrath used body slam!
//    // Poliwrath used dynamic punch!
//    // Poliwrath used body slam!
//    // Poliwrath used dynamic punch!
//    // Politoad does not have a move!
//    // E
//    // Poliwrath used body slam!
//    // Poliwrath used dynamic punch!
//    // Poliwag used tackle!
//    // Politoad used weather ball!
//
//    // problem 5: Determine the output of the program.
//    public void battleOfTheAges () {
//        Pokemon a = new Politoad();
//        Pokemon b = new Poliwrath(20);
//        Pokemon c = new Poliwag();
//        c.changeSpeed(120);
//        c.changeStrength(100);
//        if ((int)(Math.random()) * 10 < 4) {
//            a.changeHealth(150);
//            a.changeSpeed(60);
//        }
//        System.out.println(a.winsFight(b));
//        System.out.println(a.winsFight(c));
//    }
//    // A.
//    // true
//    // true
//    // B.
//    // false
//    // false
//    // C.
//    // true
//    // false
//    // D.
//    // false
//    // true
//    // E. The Program will not run.
//    // problem 6: Circle all code segments that have an error.
//    // A.
//    // Politoad p = new Poliwhirl (4);
//    // B.
//    // Politoad p = new Politoad ();
//    // Pokemon politoadClone = new Politoad ();
//    // p = politoadClone;
//    // C.
//    // Pokemon p = new Poliwag();
//    // p.changeAbility("Drizzle");
//    // D.
//    // Pokemon p = new Poliwrath(0);
//    // Pokemon p1;
//    // System.out.println(p.winsFight(p1));
//    // problem 7: Eric wants to add a new Object to the existing ones, called WaterPokemon.
//    // WaterPokemon are obviously pokemon, but Poliwag, Poliwhirl, Politoad, and Poliwrath are all water type pokemon.
//    // Eric doesn't know where to exactly add WaterPokemon in the inheritance hierarchy. Which answer
//    // is most correct for the task?
//    // A. WaterPokemon extends Pokemon, and Poliwhirl extends WaterPokemon.
//    // B. WaterPokemon extends Pokemon, and Poliwag extends WaterPokemon.
//    // C. WaterPokemon does not extend anything, and Poliwag extends WaterPokemon.
//    // D. WaterPokemon extends Pokemon, and Poliwhirl and Politoad extends WaterPokemon.
//    // E. WaterPokemon does not extend anything, and Poliwag, Poliwhirl, Politoad, and Poliwrath extends WaterPokemon.
//    //
//}
