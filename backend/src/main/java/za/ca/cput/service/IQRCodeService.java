package za.ca.cput.service;

import za.ca.cput.domain.QRCode;
import za.ca.cput.domain.Ticket;

import java.util.List;

public interface IQRCodeService extends IService<QRCode, Long>{
    List<QRCode> getAllQRCodes();
    QRCode getQRCodeByTicket(Ticket ticket);

}
