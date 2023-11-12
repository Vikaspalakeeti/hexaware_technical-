package com.hexaware.fooddelivery.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.fooddelivery.dto.MenuDTO;
import com.hexaware.fooddelivery.entity.Menu;
import com.hexaware.fooddelivery.repository.MenuRepository;
@Service
public class MenuSeviceImp implements IMenuService {
	@Autowired
	MenuRepository repo;
	@Override
	public Menu addMenu(MenuDTO menuDTO) {
		// TODO Auto-generated method stub
		Menu menu=new Menu();
		
		
		menu.setMenuItemId(menuDTO.getMenuItemId());
		menu.setRestaurantId(menuDTO.getRestaurantId());
		menu.setItemName(menuDTO.getItemName());
		menu.setDescription(menuDTO.getDescription());
		menu.setPrice(menuDTO.getPrice());
		menu.setAvailability(menuDTO.isAvailability());
		
		return repo.save(menu);
	}

	@Override
	public MenuDTO getById(int menuItemId) {
		// TODO Auto-generated method stub
		Menu menu =repo.findById(menuItemId).orElse(null);
		MenuDTO menuDTO=new MenuDTO();
		
		menuDTO.setMenuItemId(menu.getMenuItemId());
		menuDTO.setRestaurantId(menu.getRestaurantId());
		menuDTO.setItemName(menu.getItemName());
		menuDTO.setDescription(menu.getDescription());
		menuDTO.setPrice(menu.getPrice());
		menuDTO.setAvailability(menu.isAvailability());
		
		return menuDTO;
	}

	@Override
	public List<Menu> getAllMenu() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Menu updateMenu(MenuDTO menuDTO) {
		// TODO Auto-generated method stub
Menu menu=new Menu();
		
		
		menu.setMenuItemId(menuDTO.getMenuItemId());
		menu.setRestaurantId(menuDTO.getRestaurantId());
		menu.setItemName(menuDTO.getItemName());
		menu.setDescription(menuDTO.getDescription());
		menu.setPrice(menuDTO.getPrice());
		menu.setAvailability(menuDTO.isAvailability());
		
		return repo.save(menu);
		
	}

	@Override
	public void deleteById(int menuItemId) {
		// TODO Auto-generated method stub
		Menu menu =repo.findById(menuItemId).orElse(null);
		repo.deleteById(menu.getMenuItemId());

	}

	@Override
	public MenuDTO getByItemName(String itemName) {
		// TODO Auto-generated method stub
		Menu menu =repo.findByItemName(itemName);
		MenuDTO menuDTO=new MenuDTO();
		
		menuDTO.setMenuItemId(menu.getMenuItemId());
		menuDTO.setRestaurantId(menu.getRestaurantId());
		menuDTO.setItemName(menu.getItemName());
		menuDTO.setDescription(menu.getDescription());
		menuDTO.setPrice(menu.getPrice());
		menuDTO.setAvailability(menu.isAvailability());
		
		return menuDTO;
	}

}
