package com.bytescheduler.platformxadmin.modules.system.service;

import com.bytescheduler.platformxadmin.modules.system.dto.MenuDTO;
import com.bytescheduler.platformxadmin.modules.system.entity.Menu;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author byte-scheduler
 * @date 2025/5/14 21:09
 * @description
 */
public interface MenuService {

    @Transactional
    void saveMenu(MenuDTO dto);

    @Transactional
    void deleteMenu(Long menuId);

    List<Menu> getMenuTree();
}
