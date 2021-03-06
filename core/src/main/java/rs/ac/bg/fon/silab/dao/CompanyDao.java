package rs.ac.bg.fon.silab.dao;

import rs.ac.bg.fon.silab.entity.Company;

import java.util.List;

public interface CompanyDao extends AbstractDao<Company> {

    List<Company> getByTaxIdNumber(String taxIdNumber);

}
