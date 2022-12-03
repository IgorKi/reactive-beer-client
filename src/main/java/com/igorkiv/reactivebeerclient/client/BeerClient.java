package com.igorkiv.reactivebeerclient.client;

import com.igorkiv.reactivebeerclient.model.BeerDto;
import com.igorkiv.reactivebeerclient.model.BeerPagedList;
import org.springframework.http.ResponseEntity;
import reactor.core.publisher.Mono;

import java.util.UUID;

public interface BeerClient {
    Mono<BeerDto> getBeerById(UUID id, Boolean showInventoryOnHat);
    Mono<BeerPagedList> listBeers(Integer pageNumber, Integer pageSize, String beerName,String beerStyle,
                                  Boolean showInventoryOnHat);
    Mono<ResponseEntity<Void>> createBeer(BeerDto beerDto);
    Mono<ResponseEntity<Void>> updateBeer(UUID id, BeerDto beerDto);
    Mono<ResponseEntity<Void>> deleteBeerById(UUID id);
    Mono<BeerDto> getBeerByUPC(String upc);
 }
