import org.junit.jupiter.api.Test;
import ru.netology.Radio;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RadioOldTest {



    Radio rad = new Radio();

    @Test
    void radioTestNext() {

        rad.setChoiceStation(3);
        rad.stationNext();

        int expected = 4;
        int actual = rad.getRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void radioTestNextMax() {


        rad.setChoiceStation(10);

        rad.stationNext();

        int expected = 0;
        int actual = rad.getRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void radioTestPrev() {

        rad.setChoiceStation(5);

        rad.stationPrev();

        int expected = 4;
        int actual = rad.getRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void radioTestPrevMin() {

        rad.setChoiceStation(0);

        rad.stationPrev();

        int expected = 10;
        int actual = rad.getRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void radioTestChoice() {

        rad.setChoiceStation(5);


        int expected = 5;
        int actual = rad.getRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void radioTestChoiceMin() {
        rad.setChoiceStation(-1);

        int expected = 0;
        int actual = rad.getRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void radioTestChoiceMax() {

        rad.setChoiceStation(10);

        int expected = 10;
        int actual = rad.getRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void volumeTestChoice() {

        rad.setVolume(5);


        int expected = 5;
        int actual = rad.getVolume();
        assertEquals(expected, actual);
    }

    @Test
    void volumeTestChoiceMin() {
        rad.setVolume(-1);

        int expected = 0;
        int actual = rad.getVolume();
        assertEquals(expected, actual);
    }

    @Test
    void volumeTestChoiceMax() {

        rad.setVolume(101);

        int expected = 0;
        int actual = rad.getVolume();
        assertEquals(expected, actual);
    }



    @Test
    void volumeTestPlus() {
        rad.setVolume(5);

        rad.volumePlus();

        int expected = 6;
        int actual = rad.getVolume();
        assertEquals(expected, actual);
    }

    @Test
    void volumeTestPlusMax() {

        rad.setVolume(100);

        rad.volumePlus();

        int expected = 100;
        int actual = rad.getVolume();
        assertEquals(expected, actual);
    }

    @Test
    void volumeTestMinus() {

        rad.setVolume(5);

        rad.volumeMinus();

        int expected = 4;
        int actual = rad.getVolume();
        assertEquals(expected, actual);
    }

    @Test
    void volumeTestMinusMin() {

        rad.setVolume(0);

        rad.volumeMinus();

        int expected = 0;
        int actual = rad.getVolume();
        assertEquals(expected, actual);
    }

}