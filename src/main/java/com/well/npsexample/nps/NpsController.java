package com.well.npsexample.nps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/nps")
public class NpsController {

  @Autowired
  private NpsRepository npsRepository;
  
  @GetMapping(path = "/all")
  public @ResponseBody Iterable<Nps> getAllNps() {
    return npsRepository.findAll();
  }

  @PostMapping(path = "/add")
  public @ResponseBody String addNps(
    @RequestParam Integer npsGrade,
    @RequestParam boolean likedShippingValue,
    @RequestParam boolean likedPrice,
    @RequestParam boolean likedNavigation,
    @RequestParam boolean likedPayment,
    @RequestParam boolean likedDelivery
  ) {
    Nps nps = new Nps(
      npsGrade,
      likedShippingValue,
      likedPrice,
      likedNavigation,
      likedPayment,
      likedDelivery
    );
    
    npsRepository.save(nps);
    
    return "Saved";
  }

}

