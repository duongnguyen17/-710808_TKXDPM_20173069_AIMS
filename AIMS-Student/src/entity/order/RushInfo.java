package entity.order;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;

/**
 * RushInfo entity
 */
public class RushInfo{
    /***
     * rush info
     */
    private String instruction;
    /**
     * rush time
     */
    private Date time;
    /**
     * logger
     */
    private static final Logger LOGGER = utils.Utils.getLogger(RushInfo.class.getName());
    /**
     * date formatter
     */
    private final DateFormat FORMATTER = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

    /**
     * Empty constructor
     */
    RushInfo(){
        LOGGER.info("This is empty constructor, please set time and instruction after this");
    }

    /**
     * @param instruction for rush instruction
     * @param time        rush time
     */
    public RushInfo(String instruction, Date time){
        this.setInstruction(instruction);
        this.setTime(time);
    }

    /***
     * @param instruction rush instruction
     * @param time time, in format yyyy/MM/dd HH:mm:ss
     */
    public RushInfo(String instruction, String time){
        try{
            this.setTime(time);
            this.setInstruction(instruction);
        }catch(ParseException e){
            e.printStackTrace();
            LOGGER.info("Rush time must be yyyy/MM/dd HH:mm:ss");
        }
    }

    public String getInstruction(){
        return instruction;
    }

    /**
     * setter
     *
     * @param instruction rush instruction
     */
    public void setInstruction(String instruction){
        this.instruction = instruction;
    }

    public Date getTime(){
        return time;
    }

    /**
     * setter
     *
     * @param time rush time
     */
    public void setTime(Date time){
        this.time = time;
    }

    /**
     * set rush time in string
     * this is for convenient when using empty constructor, use time in string format for easy readable
     *
     * @param time time in string, must be yyyy/MM/dd HH:mm:ss
     * @throws ParseException if parsing get error
     */
    public void setTime(String time) throws ParseException{
        this.setTime(FORMATTER.parse(time));
    }

}
