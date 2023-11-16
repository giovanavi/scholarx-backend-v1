package org.sefglobal.scholarx.model;

import java.util.Map;

@Data
public class Mail {
    private String emailAddress;
    private String subject;
    private String message;
    private Map<String, Object> props;

}
