import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test                                                  //Задание 1 - радиостанции
    public void Onebetween0and9() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test                                                  //Задание 1 - радиостанции
    public void Twobetween0and9() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }


    @Test                                                  //Задание 2 - радиостанции (следующая радиостанция)
    public void onemetodNext() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        radio.next();

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test                                                  //Задание 2 - радиостанции (равно 0)
    public void twometodNext() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.next();

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test                                                 //Задание 3 - радиостанции (предыдущая радиостанция)
    public void OnemetodPrev() {
        Radio radio = new Radio();
        radio.setCurrentStation(6);

        radio.prev();

        int expected = 5;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }
    @Test                                                 //Задание 3 - радиостанции (равно 9)
    public void TwometodPrev() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test                                                 //Задание 4 - радиостанции (использование maxstation)
    public void TestMaxStation() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(18);

        int expected = 18;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void TestMaxStationmetodNext() {             //Задание 4 - радиостанции (использование maxstation)
        Radio radio = new Radio(30);
        radio.setCurrentStation(28);

        radio.next();

        int expected = 29;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test                                               //Задание 4 - радиостанции (использование maxstation)
    public void TestMaxStationmetodPrev() {
        Radio radio = new Radio(55);
        radio.setCurrentStation(51);

        radio.prev();

        int expected = 50;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test                                                  //Задание 1 - звук
    public void OneVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test                                                  //Задание 1 - звук
    public void TwoVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }
    @Test                                              //Задание 1 - звук (увеличение)
    public void increaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(97);

        radio.increaseVolume();

        int expected = 98;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test                                            //Задание 1 - звук (уменьшение)
    public void reduceVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(87);

        radio.reduceVolume();

        int expected = 86;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test                                             //Задание 2 - звук (мах)
    public void increaseVolumemax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test                                            //Задание 3 - звук (мин)
    public void reduceVolumemin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.reduceVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }
}
