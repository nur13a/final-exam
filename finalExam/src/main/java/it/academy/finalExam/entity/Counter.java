package it.academy.finalExam.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "counter")
public class Counter {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @CreatedDate
    @Builder.Default
    @Column(name="createdDate")
    Date date=new Date();

    @Column(name="count")
    Integer count;

}
