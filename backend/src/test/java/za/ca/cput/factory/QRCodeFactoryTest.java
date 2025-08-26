package za.ca.cput.factory;

import org.junit.jupiter.api.Test;
import za.ca.cput.domain.QRCode;

import static org.junit.jupiter.api.Assertions.*;

class QRCodeFactoryTest {

    @Test
    void createQRCode() {
        byte[] image = new byte[]{1, 2, 3, 4, 5};
        String data = "ShuttleBooking123";
        String format = "PNG";

        QRCode qrCode = QRCodeFactory.createQRCode(data, format, image);

        assertNotNull(qrCode);
        assertEquals(data, qrCode.getData());
        assertEquals(format, qrCode.getFormat());
        assertArrayEquals(image, qrCode.getImage());

        // Print for console inspection
        System.out.println(qrCode);

    }


}