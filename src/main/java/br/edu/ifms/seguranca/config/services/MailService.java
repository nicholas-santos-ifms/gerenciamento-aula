/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.seguranca.config.services;

import br.edu.ifms.seguranca.properties.RpasProperties;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author nicholas.santos
 */
@Service
public class MailService {

//    @Autowired
//    private JavaMailSender mailService;

    @Autowired
    private RpasProperties properties;

    /**
     * Preparação para envio de e-mail. Cria um objeto MimeMessage simplificado
     * para enviar e-mails no formato html
     *
     * @param subject
     * @param mailTo
     * @param content
     * @return
     */
    public MimeMessage prepareEmail(String subject, String mailTo, String content) {
//        try {
//            MimeMessage msg = mailService.createMimeMessage();
//            msg.setContent("Content-Type", "text/html");
//            MimeMessageHelper helper = new MimeMessageHelper(msg, false);
//
//            helper.setTo(mailTo);
//            helper.setFrom(properties.getFrom());
//            helper.setSubject(subject);
//            helper.setSentDate(new Date(System.currentTimeMillis()));
//
//            msg.setContent(content, "text/html; charset=utf-8");
//
//            return msg;
//        } catch (MessagingException ex) {
            return null;
//        }
    }

    public void sendMail(MimeMessage msg) {
//        try {
//            mailService.send(msg);
//        } catch (MailAuthenticationException ex) {
//            throw new MailNotFoundException("Falha na configuração do servidor!");
//        } catch (MailSendException ex) {
//            throw new MailNotFoundException("Falha ao tentar enviar o e-mail");
//        } catch( MailException ex) {
//            throw new MailNotFoundException(ex.getMessage());
//        }
    }
}
