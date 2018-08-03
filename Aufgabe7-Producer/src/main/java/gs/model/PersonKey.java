/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package gs.model;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class PersonKey extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -5653689418752968732L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"PersonKey\",\"namespace\":\"gs.model\",\"fields\":[{\"name\":\"steuerId\",\"type\":\"string\",\"doc\":\"Steuer-ID of Person\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<PersonKey> ENCODER =
      new BinaryMessageEncoder<PersonKey>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<PersonKey> DECODER =
      new BinaryMessageDecoder<PersonKey>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<PersonKey> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<PersonKey> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<PersonKey>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this PersonKey to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a PersonKey from a ByteBuffer. */
  public static PersonKey fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** Steuer-ID of Person */
  @Deprecated public java.lang.CharSequence steuerId;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public PersonKey() {}

  /**
   * All-args constructor.
   * @param steuerId Steuer-ID of Person
   */
  public PersonKey(java.lang.CharSequence steuerId) {
    this.steuerId = steuerId;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return steuerId;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: steuerId = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'steuerId' field.
   * @return Steuer-ID of Person
   */
  public java.lang.CharSequence getSteuerId() {
    return steuerId;
  }

  /**
   * Sets the value of the 'steuerId' field.
   * Steuer-ID of Person
   * @param value the value to set.
   */
  public void setSteuerId(java.lang.CharSequence value) {
    this.steuerId = value;
  }

  /**
   * Creates a new PersonKey RecordBuilder.
   * @return A new PersonKey RecordBuilder
   */
  public static gs.model.PersonKey.Builder newBuilder() {
    return new gs.model.PersonKey.Builder();
  }

  /**
   * Creates a new PersonKey RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new PersonKey RecordBuilder
   */
  public static gs.model.PersonKey.Builder newBuilder(gs.model.PersonKey.Builder other) {
    return new gs.model.PersonKey.Builder(other);
  }

  /**
   * Creates a new PersonKey RecordBuilder by copying an existing PersonKey instance.
   * @param other The existing instance to copy.
   * @return A new PersonKey RecordBuilder
   */
  public static gs.model.PersonKey.Builder newBuilder(gs.model.PersonKey other) {
    return new gs.model.PersonKey.Builder(other);
  }

  /**
   * RecordBuilder for PersonKey instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<PersonKey>
    implements org.apache.avro.data.RecordBuilder<PersonKey> {

    /** Steuer-ID of Person */
    private java.lang.CharSequence steuerId;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(gs.model.PersonKey.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.steuerId)) {
        this.steuerId = data().deepCopy(fields()[0].schema(), other.steuerId);
        fieldSetFlags()[0] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing PersonKey instance
     * @param other The existing instance to copy.
     */
    private Builder(gs.model.PersonKey other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.steuerId)) {
        this.steuerId = data().deepCopy(fields()[0].schema(), other.steuerId);
        fieldSetFlags()[0] = true;
      }
    }

    /**
      * Gets the value of the 'steuerId' field.
      * Steuer-ID of Person
      * @return The value.
      */
    public java.lang.CharSequence getSteuerId() {
      return steuerId;
    }

    /**
      * Sets the value of the 'steuerId' field.
      * Steuer-ID of Person
      * @param value The value of 'steuerId'.
      * @return This builder.
      */
    public gs.model.PersonKey.Builder setSteuerId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.steuerId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'steuerId' field has been set.
      * Steuer-ID of Person
      * @return True if the 'steuerId' field has been set, false otherwise.
      */
    public boolean hasSteuerId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'steuerId' field.
      * Steuer-ID of Person
      * @return This builder.
      */
    public gs.model.PersonKey.Builder clearSteuerId() {
      steuerId = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public PersonKey build() {
      try {
        PersonKey record = new PersonKey();
        record.steuerId = fieldSetFlags()[0] ? this.steuerId : (java.lang.CharSequence) defaultValue(fields()[0]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<PersonKey>
    WRITER$ = (org.apache.avro.io.DatumWriter<PersonKey>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<PersonKey>
    READER$ = (org.apache.avro.io.DatumReader<PersonKey>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
