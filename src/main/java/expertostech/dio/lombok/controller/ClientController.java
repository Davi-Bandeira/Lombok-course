package expertostech.dio.lombok.controller;

import expertostech.dio.lombok.model.ClientModel;
import expertostech.dio.lombok.repository.ClientRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/client")
public class ClientController {

    private final ClientRepository clientRepository;

    public ClientController(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @GetMapping("/listAll")
    public ResponseEntity<List<ClientModel>> listAll() {
        return ResponseEntity.ok(clientRepository.findAll());
    }

    @PostMapping("/save")
    public ResponseEntity<ClientModel> save(@RequestBody ClientModel clientModel) {
        return ResponseEntity.ok(clientRepository.save(clientModel));
    }
}
