package za.ca.cput.domain;

import java.util.Arrays;

public class QRCode {
    private String data;
    private String format;
    private byte[] image;

    protected QRCode() {
        // Default constructor for JPA
    }

    private QRCode(Builder builder) {
        this.data = builder.data;
        this.format = builder.format;
        this.image = builder.image;
    }

    public String getData() {
        return data;
    }

    public String getFormat() {
        return format;
    }

    public byte[] getImage() {
        return image;
    }

    @Override
    public String toString() {
        return "QrCode{" +
                "data='" + data + '\'' +
                ", format='" + format + '\'' +
                ", image=" + Arrays.toString(image) +
                '}';
    }

    public static class Builder {
        private String data;
        private String format;
        private byte[] image;

        public Builder setData(String data) {
            this.data = data;
            return this;
        }

        public Builder setFormat(String format) {
            this.format = format;
            return this;
        }

        public Builder setImage(byte[] image) {
            this.image = image;
            return this;
        }

        public Builder copy(Builder builder) {
            this.data = builder.data;
            this.format = builder.format;
            this.image = builder.image;
            return this;
        }

        public QRCode build() {
            return new QRCode(this);
        }
    }
}
