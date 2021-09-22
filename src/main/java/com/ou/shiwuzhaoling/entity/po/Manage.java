package com.ou.shiwuzhaoling.entity.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

/**
 * @author leo
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "manage")
public class Manage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @TableId(type = IdType.AUTO)
    @Column(name = "id")
    private Integer Id;

    @Column(name = "management_mobile")
    private String managementMobile;

    @Column(name = "management_password")
    private String managementPassword;

}
