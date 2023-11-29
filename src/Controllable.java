/*
* File: Conrollable.java
* Author: Ragány Dávid Gergő
* Copyright: 2023, Ragány Dávid Gergő
* Group: Szoft II-1-E
* Date: 2023-11-29
* Github: https://github.com/raganydavid/Feladat005.git
* Licenc: GNU GPL
*/

public interface Controllable {
    boolean start(String started);
    boolean stop(String stpped);
    int restart();
}
