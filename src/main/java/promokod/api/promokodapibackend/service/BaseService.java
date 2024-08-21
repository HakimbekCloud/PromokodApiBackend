package promokod.api.promokodapibackend.service;

import promokod.api.promokodapibackend.dto.CategoryDto;
import promokod.api.promokodapibackend.dto.PromoCodDto;
import promokod.api.promokodapibackend.dto.ResponsePromo;
import promokod.api.promokodapibackend.dto.ResponseSearch;
import promokod.api.promokodapibackend.entity.CategoryEntity;

import java.util.List;

public interface BaseService <T>{

    String createCategory(CategoryDto categoryDto);

    List<T> getAllPromoCode();

    String addPromoCode(PromoCodDto promoCodDto);

    void checkPromoCodeDate();

    List<CategoryEntity> getAllCategory();

    ResponsePromo getPromoCodeById(int id);

    ResponsePromo updatePromoCode(int id, PromoCodDto promoCodDto);

    ResponseSearch search(String query);

    ResponsePromo getCategoryById(int id);
}
