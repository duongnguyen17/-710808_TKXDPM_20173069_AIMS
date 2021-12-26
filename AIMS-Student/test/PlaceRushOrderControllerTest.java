import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import controller.PlaceRushOrderController;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import static org.junit.jupiter.api.Assertions.*;

class PlaceRushOrderControllerTest{

    @BeforeEach
    void setUp(){
    }

    @AfterEach
    void tearDown(){
    }

    @ParameterizedTest
    @CsvSource({", false", "go to street A, true"})
    void validateInstruction(String instruction, boolean expected){
        boolean isValid = PlaceRushOrderController.validateInstruction(instruction);

        assertEquals(expected, isValid);
    }

    @ParameterizedTest
    @CsvSource({"2021-12-08 22:30:30, false", "2021-12-10 23:30:30, true"})
    void validateTime(String time, boolean expected) throws ParseException{
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        boolean isValid = PlaceRushOrderController.validateTime(formatter.parse(time));

        assertEquals(isValid, expected);
    }

    @ParameterizedTest
    @CsvSource({"2021/12/08 22:30:30, false", "2021/12/10 23:30:30, true"})
    void validateTimeInString(String time, boolean expected) throws ParseException{
        boolean isValid = PlaceRushOrderController.validateTime(time);

        assertEquals(isValid, expected);
    }
}