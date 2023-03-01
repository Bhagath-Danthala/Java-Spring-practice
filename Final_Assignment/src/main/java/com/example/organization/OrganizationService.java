package com.example.organization;

import java.util.List;
import org.springframework.stereotype.Service;


@Service
public class OrganizationService {
    private OrganizationRepository organizationRepository;

    public OrganizationService(OrganizationRepository organizationRepository) {
        this.organizationRepository = organizationRepository;
    }

    public Organization createOrganization(Organization organization) {
        return organizationRepository.save(organization);
    }

    public List<Organization> getAllOrganizations() {
        return organizationRepository.findAll();
    }

    public Organization getOrganizationById(Long organizationId) {
        return organizationRepository.findById(organizationId)
                .orElseThrow();
    }
}
