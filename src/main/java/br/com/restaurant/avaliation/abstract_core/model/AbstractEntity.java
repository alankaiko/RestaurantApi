package br.com.restaurant.avaliation.abstract_core.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@MappedSuperclass
public abstract class AbstractEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCode;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate creationDate;

    @PrePersist
    public void updateDate() {
        if (this.creationDate == null)
            this.creationDate = LocalDate.now();
    }

}
