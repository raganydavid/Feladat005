/*
* File: Controller.java
* Author: Ragány Dávid Gergő
* Copyright: 2023, Ragány Dávid Gergő
* Group: Szoft II-1-E
* Date: 2023-11-29
* Github: https://github.com/raganydavid/Feladat005.git
* Licenc: GNU GPL
*/

public class Controller implements Controllable {

    @Override
    public boolean start(String started) {
        System.out.println("Ez az indító metódus");
        return true;
    }

    @Override
    public boolean stop(String stopped) {
        System.out.println("Ez a megállító metódus");
        return true;
    }

    @Override
    public int restart() {
        System.out.println("Ez az újraindító metódus hiba esetén.");
        return 404;
    }
    
}
