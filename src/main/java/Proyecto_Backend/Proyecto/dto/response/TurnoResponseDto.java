package Proyecto_Backend.Proyecto.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TurnoResponseDto {
    public Integer id;
    // datos del paciente
    public PacienteResponseDto pacienteResponseDto;
    // datos del odontologo
    public OdontologoResponseDto odontologoResponseDto;
    public String fecha;
}
