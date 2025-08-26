package za.ca.cput.factory;

import za.ca.cput.domain.QRCode;
import za.ca.cput.util.Helper;

public class QRCodeFactory {
    public static QRCode createQRCode(String data, String format, byte[] image) {
        Helper.validateString(data);
        Helper.validateString(format);
        return new QRCode.Builder()
                .setData(data)
                .setFormat(format)
                .setImage(image)
                .build();
    }
}
