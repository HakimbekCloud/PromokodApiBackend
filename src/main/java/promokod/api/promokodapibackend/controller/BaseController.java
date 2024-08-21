package promokod.api.promokodapibackend.controller;

import org.springframework.http.ResponseEntity;
import promokod.api.promokodapibackend.dto.CategoryDto;
import promokod.api.promokodapibackend.dto.PromoCodDto;
import promokod.api.promokodapibackend.dto.ResponsePromo;
import promokod.api.promokodapibackend.dto.ResponseSearch;
import promokod.api.promokodapibackend.entity.CategoryEntity;
import promokod.api.promokodapibackend.entity.PromoCodEntity;

import java.util.List;

public interface BaseController {
    ResponseEntity<String> addPromoCod(PromoCodDto promoCodDto);
    ResponseEntity<List<PromoCodEntity>> getAllPromoCod();
    ResponseEntity<List<CategoryEntity>> getAllCategory();
    ResponseEntity<String> addCategory(CategoryDto categoryDto);
    ResponseEntity<ResponsePromo> getPromoCodById(int id);
    ResponseEntity<ResponsePromo> updatePromoCod(int id, PromoCodDto promoCodDto);
    ResponseEntity<ResponseSearch> search(String keyword);
    ResponseEntity<ResponsePromo> getCategoryById(int id);
}
