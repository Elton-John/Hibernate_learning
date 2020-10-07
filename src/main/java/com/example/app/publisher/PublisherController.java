package com.example.app.publisher;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@AllArgsConstructor
@RequestMapping("/publisher")
public class PublisherController {
    private final PublisherService publisherService;

    @GetMapping("/add")
    @ResponseBody
    public String add() {
        Publisher publisher = publisherService.add();
        return String.format("publisher (id = %d) added", publisher.getId());
    }

    @GetMapping("/{id}")
    @ResponseBody
    public String findById(@PathVariable Long id) {
        Publisher publisher = publisherService.findById(id);
        return publisher.toString();
    }

    @GetMapping("/update/{id}/{name}")
    @ResponseBody
    public String update(@PathVariable Long id, @PathVariable String name) {
        Publisher publisher = publisherService.update(id, name);
        return String.format("publisher (id = %d) updated", publisher.getId());
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public String delete(@PathVariable Long id) {
        publisherService.delete(id);
        return "deleted";
    }
}
