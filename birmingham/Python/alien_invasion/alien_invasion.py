import sys

import pygame

from settings import Settings

from ship import Ship
class AlienInvasion:
    """管理游戏资源和行为的类"""

    def __init__(self):
        """初始化游戏并创建游戏资源"""
        pygame.init()
        self.settings = Settings() 

        self.screen = pygame.display.set_mode((self.settings.screen_width, self.settings.screen_height))
        pygame.display.set_caption("Alien Invasion")
        
        self.ship = Ship(self)
        # 设置背景色 RGB原理
        self.bg_color = self.settings.bg_color

    def run_game(self):
        """开始游戏的主旋律"""
        while True:
            # 监视键盘和鼠标事件
            self._check_event()
            
            self.ship.update()
            # 每次循环时都会重绘屏幕
            self._update_screen()

    def _check_event(self):
        """相应按键和鼠标事件"""
        for event in pygame.event.get():
            if event.type == pygame.QUIT:
                sys.exit()
            elif event.type == pygame.KEYDOWN:
                self._check_keydown_events(event)

            elif event.type == pygame.KEYUP:
                self._check_keyup_events(event)

    def _check_keydown_events(self, event):
        """响应按键"""
        if event.key == pygame.K_RIGHT:
            #向右移动飞船
            self.ship.moving_right = True
        elif event.key ==pygame.K_LEFT:
            self.ship.moving_left = True


        elif event.key ==pygame.K_q:


    def _check_keyup_events(self, event):
        """响应松开"""
        if event.key == pygame.K_RIGHT:
            self.ship.moving_right = False
        elif event.key ==pygame.K_LEFT:
            self.ship.moving_left = False

    def _update_screen(self):
        """更新屏幕上的图像，并且切换到新屏幕"""
        self.screen.fill(self.settings.bg_color)
        self.ship.blitme()

        # 让最近绘制的屏幕可见
        pygame.display.flip()
    
if __name__ == '__main__':
    # 创造游戏实例并且运行游戏
    ai = AlienInvasion()
    ai.run_game()
