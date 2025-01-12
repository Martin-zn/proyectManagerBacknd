package com.api.proyectos.proyectManager.models;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class CreateProjectBody {

    private String name;
    private String contraseña;
    private String description;
    private Date startDate;
    private Date endDate;
    private List<String> roles;
    private List<Long> equipo;
    private List<ActivityBody> actividades;
}
