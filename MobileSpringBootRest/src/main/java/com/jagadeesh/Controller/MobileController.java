package com.jagadeesh.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jagadeesh.Repo.MobileRepo;
import com.jagadeesh.model.Mobile;

@RestController
public class MobileController {
	@Autowired
	private MobileRepo mbrepo;
	@PostMapping("/save")
	public Mobile saveMb(@RequestBody Mobile mbl)
	{
		return mbrepo.save(mbl);
	}
	@DeleteMapping("/delete/{modelno}")
	public void deleteMbl(@PathVariable Integer modelno)
	{
		mbrepo.deleteById(modelno);
	}
	@GetMapping("/get/{modelno}")
	public Mobile getMb(@PathVariable Integer modelno)
	{
		return mbrepo.findById(modelno).get();
	}
	@GetMapping("/getAll")
	public List<Mobile> findAll()
	{
		return (List<Mobile>) mbrepo.findAll();
	}
	@PutMapping("/update/{modelno}")
	public Mobile updateMb(@RequestBody Mobile mbl,@PathVariable Integer modelno)
	{
		Optional<Mobile> optional=mbrepo.findById(modelno);
		Mobile mb1=optional.get();
		mb1.setModelno(modelno);
		mb1.setMobilename(mbl.getMobilename());
		mb1.setCmpname(mbl.getCmpname());
		mb1.setRam(mbl.getRam());
		mb1.setRom(mbl.getRom());
		mb1.setProcessor(mbl.getProcessor());
		return mbrepo.save(mb1);
	}
	
}
