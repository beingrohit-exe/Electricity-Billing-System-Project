package com.electricitybilling.electricity_billing_system_project.Entity;

import com.electricitybilling.electricity_billing_system_project.Payload.ConnectionType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Connection {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer connectionId;

    @Column(unique = true, updatable = false)
    private String consumerNo;
    private Date appliedDate;
    private Date connectionDate;
    private Boolean connectionStatus;

    @Enumerated(EnumType.STRING)
    private ConnectionType connectionType;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.DETACH)
    @JsonIgnore
    private Customer customer;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Address address;
}
