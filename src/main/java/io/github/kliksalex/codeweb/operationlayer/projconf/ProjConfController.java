package io.github.kliksalex.codeweb.operationlayer.projconf;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class ProjConfController {
    private final ProjConfService service;
}
