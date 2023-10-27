package Send_Email_SpringBoot.Send_Email_SpringBoot.model;


import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class MailStructure{
    private String subject;
    private String message;
}
