package br.com.gabrielgomes.gestao_vagas.modules.candidate.useCases;

import br.com.gabrielgomes.gestao_vagas.modules.candidate.CandidateRepository;
import br.com.gabrielgomes.gestao_vagas.modules.candidate.dto.ProfileCandidateResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ProfileCandidateUseCase {
    @Autowired
    private CandidateRepository candidateRepository;

    public ProfileCandidateResponseDTO execute(UUID idCandidate){
        var candidate  = this.candidateRepository.findById(idCandidate).orElseThrow(()->{
            throw new UsernameNotFoundException("User Not found");
        });
        return ProfileCandidateResponseDTO.builder()
                .description(candidate.getDescription())
                .username(candidate.getUsername())
                .email(candidate.getEmail())
                .name(candidate.getName())
                .id(candidate.getId())
                .build();

    }
}
