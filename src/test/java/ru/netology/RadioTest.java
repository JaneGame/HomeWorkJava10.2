package ru.netology;

import org.junit.jupiter.api.Test;
import ru.netology.Radio;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RadioTest {


    Radio rad1 = new Radio();

    @Test
    void radioTestNext() {

        rad1.setChoiceStation(3);
        rad1.stationNext();

        int expected = 4;
        int actual = rad1.getRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void radioTestNextMax() {


        rad1.setChoiceStation(10);

        rad1.stationNext();

        int expected = 0;
        int actual = rad1.getRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void radioTestPrev() {

        rad1.setChoiceStation(5);

        rad1.stationPrev();

        int expected = 4;
        int actual = rad1.getRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void radioTestPrevMin() {

        rad1.setChoiceStation(0);

        rad1.stationPrev();

        int expected = 10;
        int actual = rad1.getRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void radioTestChoice() {

        rad1.setChoiceStation(5);


        int expected = 5;
        int actual = rad1.getRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void radioTestChoiceMin() {
        rad1.setChoiceStation(-1);

        int expected = 0;
        int actual = rad1.getRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void radioTestChoiceMax() {

        rad1.setChoiceStation(11);

        int expected = 0;
        int actual = rad1.getRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void volumeTestChoice() {

        rad1.setVolume(5);


        int expected = 5;
        int actual = rad1.getVolume();
        assertEquals(expected, actual);
    }

    @Test
    void volumeTestChoiceMin() {
        rad1.setVolume(-1);

        int expected = 0;
        int actual = rad1.getVolume();
        assertEquals(expected, actual);
    }

    @Test
    void volumeTestChoiceMax() {

        rad1.setVolume(101);

        int expected = 0;
        int actual = rad1.getVolume();
        assertEquals(expected, actual);
    }


    @Test
    void volumeTestPlus() {
        rad1.setVolume(5);

        rad1.volumePlus();

        int expected = 6;
        int actual = rad1.getVolume();
        assertEquals(expected, actual);
    }

    @Test
    void volumeTestPlusMax() {

        rad1.setVolume(100);

        rad1.volumePlus();

        int expected = 100;
        int actual = rad1.getVolume();
        assertEquals(expected, actual);
    }

    @Test
    void volumeTestMinus() {

        rad1.setVolume(5);

        rad1.volumeMinus();

        int expected = 4;
        int actual = rad1.getVolume();
        assertEquals(expected, actual);
    }

    @Test
    void volumeTestMinusMin() {

        rad1.setVolume(0);

        rad1.volumeMinus();

        int expected = 0;
        int actual = rad1.getVolume();
        assertEquals(expected, actual);
    }

}
