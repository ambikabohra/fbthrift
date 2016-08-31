package test.fixtures.module2;

import com.facebook.swift.codec.*;
import com.facebook.swift.codec.ThriftField.Requiredness;
import com.facebook.swift.codec.ThriftField.Recursiveness;
import java.util.*;

import static com.google.common.base.MoreObjects.toStringHelper;

@ThriftStruct("BigStruct")
public final class BigStruct
{
    @ThriftConstructor
    public BigStruct(
        @ThriftField(value=1, name="s", requiredness=Requiredness.NONE) final test.fixtures.module2.Struct s,
        @ThriftField(value=2, name="id", requiredness=Requiredness.NONE) final int id
    ) {
        this.s = s;
        this.id = id;
    }

    public static class Builder {
        private test.fixtures.module2.Struct s;

        public Builder setS(test.fixtures.module2.Struct s) {
            this.s = s;
            return this;
        }
        private int id;

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder() { }
        public Builder(BigStruct other) {
            this.s = other.s;
            this.id = other.id;
        }

        public BigStruct build() {
            return new BigStruct (
                this.s,
                this.id
            );
        }
    }

    private final test.fixtures.module2.Struct s;

    @ThriftField(value=1, name="s", requiredness=Requiredness.NONE)
    public test.fixtures.module2.Struct getS() { return s; }

    private final int id;

    @ThriftField(value=2, name="id", requiredness=Requiredness.NONE)
    public int getId() { return id; }

    @Override
    public String toString()
    {
        return toStringHelper(this)
            .add("s", s)
            .add("id", id)
            .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        BigStruct other = (BigStruct)o;

        return
            Objects.equals(s, other.s) &&
            Objects.equals(id, other.id);
    }

    @Override
    public int hashCode() {
        return Arrays.deepHashCode(new Object[] {
            s,
            id
        });
    }
}