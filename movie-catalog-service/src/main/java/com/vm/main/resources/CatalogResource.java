/**
 * 
 */
package com.vm.main.resources;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vm.main.models.CatalogItem;

/**
 * @author Sai Teja
 *
 */

@RestController
@RequestMapping("/{catalog}")
public class CatalogResource {

	@RequestMapping("/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable("userId") String userId)
	{
		return Collections.singletonList(
				new CatalogItem("Test","Test Desc",4)
				);
	}
}
