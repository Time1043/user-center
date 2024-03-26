import {GithubOutlined} from '@ant-design/icons';
import {DefaultFooter} from '@ant-design/pro-components';
import React from 'react';
import {GITHUB_LINK} from "@/constants";

const Footer: React.FC = () => {
  return (
    <DefaultFooter
      copyright=" from 2024 Time1043 "
      style={{
        background: 'none',
      }}
      links={[
        {
          key: 'planet',
          title: '知识星球',
          href: 'https://wx.zsxq.com/',
          blankTarget: true,
        },
        {
          key: 'cookNav',
          title: '编程导航',
          href: 'https://www.code-nav.cn/',
          blankTarget: true,
        },
        {
          key: 'github',
          title: <GithubOutlined/>,
          href: GITHUB_LINK,
          blankTarget: true,
        },
      ]}
    />
  );
};

export default Footer;
