package br.com.mdev.cn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mdev.cn.model.Authority;

public interface AuthorityRepository extends JpaRepository<Authority, String> {

    Authority findByName(String name);

}