import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.Accessors;

@Getter
@Accessors(fluent = true)
@ToString
@Entity(name = "\"ApplyingStatusCodes\"")
public class ApplyingStatusCodes {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "value")
    private String value;

}
