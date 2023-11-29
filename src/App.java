/*
* File: App.java
* Author: Ragány Dávid Gergő
* Copyright: 2023, Ragány Dávid Gergő
* Group: Szoft II-1-E
* Date: 2023-11-29
* Github: https://github.com/raganydavid/Feladat005.git
* Licenc: GNU GPL
*/

public class App {
    public static void main(String[] args) throws Exception {
        Controller controller = new Controller();

        boolean startTest = controller.start("Elindult");
        System.out.println("Indítás tesztje: " + startTest);

        boolean stopTest = controller.stop("Megállt");
        System.out.println("Megállítás tesztje: " + stopTest);

        int restartTest = controller.restart();
        System.out.println("Újraindítás tesztje hibakóddal: " + restartTest);
    }
}
