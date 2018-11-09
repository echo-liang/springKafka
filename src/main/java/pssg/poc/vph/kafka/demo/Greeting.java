package pssg.poc.vph.kafka.demo;

/**
 * The Class Greeting.
 * @author HLiang
 */
public class Greeting {

    /** The msg. */
    private String msg;
    
    /** The name. */
    private String name;

    /**
     * Instantiates a new greeting.
     */
    public Greeting() {

    }

    /**
     * Instantiates a new greeting.
     *
     * @param msg the msg
     * @param name the name
     */
    public Greeting(String msg, String name) {
        this.msg = msg;
        this.name = name;
    }

    /**
     * Gets the msg.
     *
     * @return the msg
     */
    public String getMsg() {
        return msg;
    }

    /**
     * Sets the msg.
     *
     * @param msg the new msg
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     * Gets the name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name.
     *
     * @param name the new name
     */
    public void setName(String name) {
        this.name = name;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return msg + ", " + name + "!";
    }
}