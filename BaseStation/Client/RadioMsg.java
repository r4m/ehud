/**
 * This class is automatically generated by mig. DO NOT EDIT THIS FILE.
 * This class implements a Java interface to the 'RadioMsg'
 * message type.
 */

public class RadioMsg extends net.tinyos.message.Message {

    /** The default size of this message type in bytes. */
    public static final int DEFAULT_MESSAGE_SIZE = 12;

    /** The Active Message type associated with this message. */
    public static final int AM_TYPE = 41;

    /** Create a new RadioMsg of size 12. */
    public RadioMsg() {
        super(DEFAULT_MESSAGE_SIZE);
        amTypeSet(AM_TYPE);
    }

    /** Create a new RadioMsg of the given data_length. */
    public RadioMsg(int data_length) {
        super(data_length);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new RadioMsg with the given data_length
     * and base offset.
     */
    public RadioMsg(int data_length, int base_offset) {
        super(data_length, base_offset);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new RadioMsg using the given byte array
     * as backing store.
     */
    public RadioMsg(byte[] data) {
        super(data);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new RadioMsg using the given byte array
     * as backing store, with the given base offset.
     */
    public RadioMsg(byte[] data, int base_offset) {
        super(data, base_offset);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new RadioMsg using the given byte array
     * as backing store, with the given base offset and data length.
     */
    public RadioMsg(byte[] data, int base_offset, int data_length) {
        super(data, base_offset, data_length);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new RadioMsg embedded in the given message
     * at the given base offset.
     */
    public RadioMsg(net.tinyos.message.Message msg, int base_offset) {
        super(msg, base_offset, DEFAULT_MESSAGE_SIZE);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new RadioMsg embedded in the given message
     * at the given base offset and length.
     */
    public RadioMsg(net.tinyos.message.Message msg, int base_offset, int data_length) {
        super(msg, base_offset, data_length);
        amTypeSet(AM_TYPE);
    }

    /**
    /* Return a String representation of this message. Includes the
     * message type name and the non-indexed field values.
     */
    public String toString() {
      String s = "Message <RadioMsg> \n";
      try {
        s += "  [rssi=0x"+Long.toHexString(get_rssi())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [rss=0x"+Long.toHexString(get_rss())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [lqi=0x"+Long.toHexString(get_lqi())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [channel=0x"+Long.toHexString(get_channel())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [power=0x"+Long.toHexString(get_power())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [id=0x"+Long.toHexString(get_id())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [counter=0x"+Long.toHexString(get_counter())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      return s;
    }

    // Message-type-specific access methods appear below.

    /////////////////////////////////////////////////////////
    // Accessor methods for field: rssi
    //   Field type: short, unsigned
    //   Offset (bits): 0
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'rssi' is signed (false).
     */
    public static boolean isSigned_rssi() {
        return false;
    }

    /**
     * Return whether the field 'rssi' is an array (false).
     */
    public static boolean isArray_rssi() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'rssi'
     */
    public static int offset_rssi() {
        return (0 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'rssi'
     */
    public static int offsetBits_rssi() {
        return 0;
    }

    /**
     * Return the value (as a short) of the field 'rssi'
     */
    public short get_rssi() {
        return (short)getSIntBEElement(offsetBits_rssi(), 16);
    }

    /**
     * Set the value of the field 'rssi'
     */
    public void set_rssi(short value) {
        setSIntBEElement(offsetBits_rssi(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'rssi'
     */
    public static int size_rssi() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'rssi'
     */
    public static int sizeBits_rssi() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: rss
    //   Field type: short, unsigned
    //   Offset (bits): 16
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'rss' is signed (false).
     */
    public static boolean isSigned_rss() {
        return false;
    }

    /**
     * Return whether the field 'rss' is an array (false).
     */
    public static boolean isArray_rss() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'rss'
     */
    public static int offset_rss() {
        return (16 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'rss'
     */
    public static int offsetBits_rss() {
        return 16;
    }

    /**
     * Return the value (as a short) of the field 'rss'
     */
    public short get_rss() {
        return (short)getSIntBEElement(offsetBits_rss(), 16);
    }

    /**
     * Set the value of the field 'rss'
     */
    public void set_rss(short value) {
        setSIntBEElement(offsetBits_rss(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'rss'
     */
    public static int size_rss() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'rss'
     */
    public static int sizeBits_rss() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: lqi
    //   Field type: short, unsigned
    //   Offset (bits): 32
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'lqi' is signed (false).
     */
    public static boolean isSigned_lqi() {
        return false;
    }

    /**
     * Return whether the field 'lqi' is an array (false).
     */
    public static boolean isArray_lqi() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'lqi'
     */
    public static int offset_lqi() {
        return (32 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'lqi'
     */
    public static int offsetBits_lqi() {
        return 32;
    }

    /**
     * Return the value (as a short) of the field 'lqi'
     */
    public short get_lqi() {
        return (short)getSIntBEElement(offsetBits_lqi(), 16);
    }

    /**
     * Set the value of the field 'lqi'
     */
    public void set_lqi(short value) {
        setSIntBEElement(offsetBits_lqi(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'lqi'
     */
    public static int size_lqi() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'lqi'
     */
    public static int sizeBits_lqi() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: channel
    //   Field type: short, unsigned
    //   Offset (bits): 48
    //   Size (bits): 8
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'channel' is signed (false).
     */
    public static boolean isSigned_channel() {
        return false;
    }

    /**
     * Return whether the field 'channel' is an array (false).
     */
    public static boolean isArray_channel() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'channel'
     */
    public static int offset_channel() {
        return (48 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'channel'
     */
    public static int offsetBits_channel() {
        return 48;
    }

    /**
     * Return the value (as a short) of the field 'channel'
     */
    public short get_channel() {
        return (short)getUIntBEElement(offsetBits_channel(), 8);
    }

    /**
     * Set the value of the field 'channel'
     */
    public void set_channel(short value) {
        setUIntBEElement(offsetBits_channel(), 8, value);
    }

    /**
     * Return the size, in bytes, of the field 'channel'
     */
    public static int size_channel() {
        return (8 / 8);
    }

    /**
     * Return the size, in bits, of the field 'channel'
     */
    public static int sizeBits_channel() {
        return 8;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: power
    //   Field type: short, unsigned
    //   Offset (bits): 56
    //   Size (bits): 8
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'power' is signed (false).
     */
    public static boolean isSigned_power() {
        return false;
    }

    /**
     * Return whether the field 'power' is an array (false).
     */
    public static boolean isArray_power() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'power'
     */
    public static int offset_power() {
        return (56 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'power'
     */
    public static int offsetBits_power() {
        return 56;
    }

    /**
     * Return the value (as a short) of the field 'power'
     */
    public short get_power() {
        return (short)getUIntBEElement(offsetBits_power(), 8);
    }

    /**
     * Set the value of the field 'power'
     */
    public void set_power(short value) {
        setUIntBEElement(offsetBits_power(), 8, value);
    }

    /**
     * Return the size, in bytes, of the field 'power'
     */
    public static int size_power() {
        return (8 / 8);
    }

    /**
     * Return the size, in bits, of the field 'power'
     */
    public static int sizeBits_power() {
        return 8;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: id
    //   Field type: int, unsigned
    //   Offset (bits): 64
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'id' is signed (false).
     */
    public static boolean isSigned_id() {
        return false;
    }

    /**
     * Return whether the field 'id' is an array (false).
     */
    public static boolean isArray_id() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'id'
     */
    public static int offset_id() {
        return (64 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'id'
     */
    public static int offsetBits_id() {
        return 64;
    }

    /**
     * Return the value (as a int) of the field 'id'
     */
    public int get_id() {
        return (int)getUIntBEElement(offsetBits_id(), 16);
    }

    /**
     * Set the value of the field 'id'
     */
    public void set_id(int value) {
        setUIntBEElement(offsetBits_id(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'id'
     */
    public static int size_id() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'id'
     */
    public static int sizeBits_id() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: counter
    //   Field type: int, unsigned
    //   Offset (bits): 80
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'counter' is signed (false).
     */
    public static boolean isSigned_counter() {
        return false;
    }

    /**
     * Return whether the field 'counter' is an array (false).
     */
    public static boolean isArray_counter() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'counter'
     */
    public static int offset_counter() {
        return (80 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'counter'
     */
    public static int offsetBits_counter() {
        return 80;
    }

    /**
     * Return the value (as a int) of the field 'counter'
     */
    public int get_counter() {
        return (int)getUIntBEElement(offsetBits_counter(), 16);
    }

    /**
     * Set the value of the field 'counter'
     */
    public void set_counter(int value) {
        setUIntBEElement(offsetBits_counter(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'counter'
     */
    public static int size_counter() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'counter'
     */
    public static int sizeBits_counter() {
        return 16;
    }

}