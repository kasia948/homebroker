package com.homebroker.demo;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

@Controller
public class HomeController {
    private DeveloperRepository developerRepository;
    private InvestmentRepository investmentRepository;
    private DeveloperDetailsRepository developerDetailsRepository;
    private OfferApartmentRepository offerApartmentRepository;

    public HomeController(DeveloperRepository developerRepository, InvestmentRepository investmentRepository, DeveloperDetailsRepository developerDetailsRepository, OfferApartmentRepository offerApartmentRepository) {
        this.developerRepository = developerRepository;
        this.investmentRepository = investmentRepository;
        this.developerDetailsRepository=developerDetailsRepository;
        this.offerApartmentRepository=offerApartmentRepository;
    }

    @GetMapping("/")
    public String list(Model model) {
        List<Developer> developers = developerRepository.findAll();
        model.addAttribute("developers", developers);
        return "index";
    }

    @GetMapping("/developer")
    public String list1 (Model model){
        List <Developer> developers=developerRepository.findAll();
        model.addAttribute("developers", developers);
        return "developer";
    }
    @GetMapping("/devDetails")
    public String list2 (@RequestParam Long id, Model model){

        Optional<Developer> devOptional = developerRepository.findById(id);
        Optional<DeveloperDetails> devDetailsOptional=developerDetailsRepository.findById(id);
        Optional <Investment> investmentsOptional =investmentRepository.findById(id);

        if(devOptional.isPresent()) {
            Developer dev = devOptional.get();
            DeveloperDetails devDetails=devDetailsOptional.get();
            model.addAttribute("dev", dev);
            model.addAttribute("details", devDetails);
            List <Investment> dev2=dev.getInvestments();
            model.addAttribute("investments", dev2);
        }
        return "developerDetails";
    }

    @GetMapping("/invDetails")
    public String list3 (@RequestParam Long id, Model model){
        Optional <Investment> investmentsOptional =investmentRepository.findById(id);
        List<OfferApartment> offerApartments=offerApartmentRepository.findAll();

        if(investmentsOptional.isPresent()) {
            Investment inv = investmentsOptional.get();;

            model.addAttribute("details", inv);
            model.addAttribute("offerApartments", offerApartments);
        }
        return "investmentDetails";
    }

    @GetMapping("/apartDetails")
    public String list4 (@RequestParam Long id, Model model){
        Optional <OfferApartment> offerApartments=offerApartmentRepository.findById(id);
        if(offerApartments.isPresent()) {
            OfferApartment offApp = offerApartments.get();;
            model.addAttribute("ApartDetails", offApp);
        }
        return "offerApartmentDetails";
    }

    @GetMapping("/dodajDevelopera")
    public String home(Model model) {
        model.addAttribute("newDeveloper", new Developer());
        model.addAttribute("newDetails", new DeveloperDetails());
        return "adddeveloper";
    }

    @PostMapping("/adddeveloper")
    public String addDeveloper (Developer developer, DeveloperDetails devDetails) {
        developerDetailsRepository.save(devDetails);
        developerRepository.save(developer);
        return "redirect:/devDetails?id="+developer.getId();
//        return "redirect:/developer?id=" + developer.getId();
    }

    @GetMapping("/dodajInwestycje")
    public String home1(Model model) {
        model.addAttribute("newInvestment", new Investment());
        return "addInvestment";
    }

    @PostMapping("/addInvestment")
    public String addInvestment (Investment investment) {
        investmentRepository.save(investment);
        return "redirect:/invDetails?id="+investment.getId();
//        return "redirect:/developer?id=" + developer.getId();
    }

    @GetMapping("/dodajMieszkanie")
    public String home2(Model model) {
        model.addAttribute("newOfferApartment", new OfferApartment());
        return "addApartment";
    }

    @PostMapping("/addOfferApartment")
    public String addOfferApartment (OfferApartment offerApartment) {
        offerApartmentRepository.save(offerApartment);
        return "redirect:/apartDetails?id="+offerApartment.getId();
//        return "redirect:/developer?id=" + developer.getId();
    }

}
