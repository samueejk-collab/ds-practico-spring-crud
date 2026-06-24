package etec.crud.controller

import etec.crud.model.Instrumento
import etec.crud.service.InstrumentoServicio
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

class InstrumentoControlador {
@RestController
@RequestMapping("/api/instrumentos")
class InstrumentoControlador(
    @Autowired private val servicio: InstrumentoServicio
){
    @GetMapping
    fun listarTodos(): list<Instrumento> {
        return servicio.listarTodos()
    }
}
}
