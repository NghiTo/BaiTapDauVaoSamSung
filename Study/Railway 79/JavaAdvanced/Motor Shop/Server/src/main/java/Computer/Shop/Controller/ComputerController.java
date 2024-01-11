package Computer.Shop.Controller;

import Computer.Shop.Dto.ComputerDto;
import Computer.Shop.Entity.Computer;
import Computer.Shop.Form.ComputerCreateForm;
import Computer.Shop.Form.ComputerUpdateForm;
import Computer.Shop.Service.ComputerService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@Validated
@AllArgsConstructor
@CrossOrigin("http://127.0.0.1:5500")
public class ComputerController
{
    private final ComputerService computerService;

    @GetMapping("/api/v1/computers")
    public Page<ComputerDto> findAll(Pageable pageable)
    {
        return computerService.findAll(pageable);
    }

    @PostMapping("/api/v1/computers")
    public ComputerDto create(@RequestBody @Valid ComputerCreateForm form)
    {
        return computerService.create(form);
    }

    @PutMapping("/api/v1/computers")
    public ComputerDto update(@RequestBody @Valid ComputerUpdateForm form)
    {
        return computerService.update(form);
    }

    @DeleteMapping("/api/v1/computers")
    public void deleteById(@RequestBody Computer.PrimaryKey id)
    {
        computerService.deleteById(id);
    }
}
