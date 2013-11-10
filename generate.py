#!/usr/bin/env python

import os
import sys

import datetime

from jinja2 import Template

def generate_project_dir(context):
    template_dir = [ item for item in os.listdir('.')
                     if '{{' in item ][0]

    dir_name = Template(template_dir)
    dir_name = dir_name.render(**context)

    os.mkdir(dir_name)

    ROOT_PATH = os.path.dirname(os.path.abspath(__file__))
    TEMPLATE_PATH = os.path.join(os.path.dirname(os.path.abspath(__file__)),template_dir)
    PROJECT_PATH = os.path.join(os.path.dirname(os.path.abspath(__file__)),dir_name)

    files = [ name for name in os.listdir(TEMPLATE_PATH) if os.path.isfile(os.path.join(TEMPLATE_PATH, name))]

    for in_file in files:
        in_file = os.path.join(TEMPLATE_PATH, in_file)
        out_file = Template(os.path.join(PROJECT_PATH, in_file))
        out_file = out_file.render(**context)

        with open(in_file) as f, open(out_file,'w') as f1:
            template = Template(f.read())
            rendered_content = template.render(**context)
            f1.write(rendered_content)

if __name__ == '__main__':
    context = {
        'project_dir': sys.argv[1],
        'project_name': sys.argv[1],
        'time': datetime.datetime.now().strftime("%A, %d. %B %Y %I:%M%p")
    }
    generate_project_dir(context)



